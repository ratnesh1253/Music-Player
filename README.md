# Music Player

A simple Java console application for managing and playing a playlist of songs.

## Data Structures and Algorithms

This project demonstrates my knowledge of Data Structures and Algorithms, specifically the implementation and use of a doubly linked list. The playlist is managed using a doubly linked list, which allows efficient addition and removal of songs at both ends of the list, as well as easy traversal in both directions (forward and backward).
also efficient tracking of size for the number of songs in the playlist.


## Project Description

This project allows users to create a playlist of songs, navigate through the playlist, and play songs. It provides functionalities to add songs to the beginning or end of the playlist, play the current song, move to the next or previous song, display the playlist, and remove songs from the playlist.

## Features

- **Add Song**: Add a new song to the beginning or end of the playlist.
- **Play**: Play the current song in the playlist.
- **Next**: Move to the next song in the playlist.
- **Previous**: Move to the previous song in the playlist.
- **Display Playlist**: Show all songs in the playlist.
- **Remove Song**: Remove the first or last song from the playlist.

## Menu Options

When you run the program, you will see the following menu:

```
**************************
1. Add song to playlist
2. Play
3. Next
4. Previous
5. Display Playlist
6. Remove Song
7. Exit
Enter choice: 
```

## Adding a Song

You can add a song to the playlist by choosing option 1. You will then be prompted to add the song to the beginning or end of the playlist and to provide the song's title and artist.

## Playing a Song

Choose option 2 to play the current song. If no song is currently selected, it will play the first song in the playlist.

## Navigating the Playlist

- **Next**: Choose option 3 to play the next song in the playlist.
- **Previous**: Choose option 4 to play the previous song in the playlist.

## Displaying the Playlist

Choose option 5 to display all songs in the playlist, including their titles and artists.

## Removing a Song

You can remove a song from the playlist by choosing option 6. You will be prompted to remove the first or last song.

## Example Usage

Here's an example of how you might interact with the program:

```
**************************
1. Add song to playlist
2. Play
3. Next
4. Previous
5. Display Playlist
6. Remove Song
7. Exit
Enter choice: 1

1. Add First
2. Add Last
Enter choice: 2

Enter Song Title: 
Shape of You
Enter Song Artist: 
Ed Sheeran

**************************
1. Add song to playlist
2. Play
3. Next
4. Previous
5. Display Playlist
6. Remove Song
7. Exit
Enter choice: 5

Current Playlist:
Total Songs: 1
[Title: Shape of You	Artist: Ed Sheeran]
```

## How to Use

1. **Clone this repository** to your local machine:
   ```sh
   git clone https://github.com/your-username/MusicPlayer.git
   cd MusicPlayer
   ```

2. **Compile the `MusicPlayer.java` file**:
   ```sh
   javac MusicPlayer.java
   ```

3. **Run the `MusicPlayer` program**:
   ```sh
   java MusicPlayer
   ```

## Contact

For any questions or feedback, please contact [email](mailto:ratneshkshirsagar1253@gmail.com).
```
