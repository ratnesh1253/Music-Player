import java.util.Scanner;

public class MusicPlayer {
    public static class Song {
        String title;
        String artist;

        public Song(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }
    }

    public static class Node {
        Song song;
        Node next;
        Node prev;

        public Node(Song song) {
            this.song = song;
        }
    }

    public static Node head;
    public static Node tail;
    public static Node currSong;
    public static int size;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MusicPlayer playlist = new MusicPlayer();
        boolean running = true;
        while (running == true) {
            System.out.println("\n**************************");
            System.out.println("1. Add song to playlist");
            System.out.println("2. Play");
            System.out.println("3. Next");
            System.out.println("4. Previous");
            System.out.println("5. Display Playlist");
            System.out.println("6. Remove Song");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n1. Add First");
                    System.out.println("2. Add Last");
                    System.out.print("Enter choice: ");
                    int add = sc.nextInt();
                    System.out.println("\nEnter Song Title: ");
                    sc.nextLine();
                    String title = sc.nextLine();
                    System.out.println("Enter Song Artist: ");
                    String artist = sc.nextLine();
                    Song newSong = new Song(title, artist);
                    switch (add) {
                        case 1:
                            playlist.addSongToFirst(newSong);
                            break;
                        case 2:
                            playlist.addSongToLast(newSong);
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
                    break;
                case 2:
                    playlist.play();
                    break;
                case 3:
                    playlist.next();
                    break;
                case 4:
                    playlist.previous();
                    break;
                case 5:
                    System.out.println("\nCurrent Playlist:");
                    playlist.displayPlaylist();
                    break;
                case 6:
                    System.out.println("\n1. Remove First");
                    System.out.println("1. Remove Second");
                    System.out.print("Enter choice: ");
                    add = sc.nextInt();
                    switch (add) {
                        case 1:
                            playlist.removeFirst();
                            break;
                        case 2:
                            playlist.removeLast();
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                    break;
                case 7:
                    System.out.println("\nExiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again...");
            }
        }
    }

    public void addSongToFirst(Song song) {
        Node newNode = new Node(song);
        size++;
        if (head == null) {
            head = tail = newNode;
            head.prev = head.next = null;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        head.prev = null;
    }

    public void addSongToLast(Song song) {
        Node newNode = new Node(song);
        size++;
        if (head == null) {
            head = tail = newNode;
            head.prev = head.next = null;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void play() {
        if (head == null) {
            System.out.println("\nEmpty playlist");
            return;
        }
        if (currSong == null) {
            currSong = head;
        }
        System.out.println("\nNow Playing: ");
        System.out.println(currSong.song.title + " by " + currSong.song.artist);
    }

    public void next() {
        if (head == null) {
            System.out.println("\nEmpty playlist");
            return;
        }
        if (currSong == null) {
            currSong = head;
        }
        if (currSong.next == null) {
            System.out.println("\nEnd of playlist reached..");
            currSong = tail;
            return;
        } else {
            currSong = currSong.next;
            System.out.println("\nNow Playing: ");
            System.out.println(currSong.song.title + " by " + currSong.song.artist);
        }
    }

    public void previous() {
        if (head == null) {
            System.out.println("\nEmpty playlist");
            return;
        }
        if (currSong == null) {
            currSong = head;
        }
        if (currSong.prev == null) {
            System.out.println("\nBegining of playlist reached..");
            currSong = head;
            return;
        } else {
            currSong = currSong.prev;
            System.out.println("\nNow Playing: ");
            System.out.println(currSong.song.title + " by " + currSong.song.artist);
        }
    }

    public void displayPlaylist() {
        if (head == null) {
            System.out.println("\nEmpty Playlist");
            return;
        }
        System.out.println("Total Songs: " + size);
        Node temp = head;
        while (temp != null) {
            System.out.println("[Title: " + temp.song.title + "\tArtist: " + temp.song.artist + "]");
            temp = temp.next;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("\nEmpty playlist");
            return;
        }
        System.out.println("\nSong removed: ");
        System.out.println(head.song.title + " by " + head.song.artist);
        head.next = head;
        head.prev = null;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("\nEmpty playlist");
            return;
        }
        System.out.println("\nSong removed: ");
        System.out.println(tail.song.title + " by " + tail.song.artist);
        tail.prev = tail;
        tail.next = null;
        size--;
    }
}