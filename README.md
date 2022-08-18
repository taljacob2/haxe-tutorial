# haxe-tutorial

## Installation

> Video Tutorials:
> - [Basic Demo](https://www.youtube.com/watch?v=xePJU7HTNkg&ab_channel=RichardOliverBray)
> - [Tutorial Playlist](https://www.youtube.com/playlist?list=PLnweXVCg6yWodTlo3BQXicKJuGrTp_yeV)

1. Download Haxe [here!](https://haxe.org/download/)

1. Using [VSCode](https://code.visualstudio.com/) as our IDE, download the Haxe extensions for VSCode:
   - [Haxe](https://marketplace.visualstudio.com/items?itemName=nadako.vshaxe)
   - [Haxe Checkstyle](https://marketplace.visualstudio.com/items?itemName=vshaxe.haxe-checkstyle)
   - [Haxe Extension Pack](https://marketplace.visualstudio.com/items?itemName=vshaxe.haxe-extension-pack)
   > NOTE: You may use other [Haxe-supported IDEs](https://haxe.org/documentation/introduction/editors-and-ides.html), to your liking.

## Initialize A New Project

1. In VSCode, open up the command tool with
   <kbd>CTRL</kbd> + <kbd>SHIFT</kbd> + <kbd>P</kbd>,
   and click on "Haxe: Initialize Project".
   This will initialize a new Haxe project, including the following files:
   * `src/Main.hx`: Entry point Haxe source file
   * `build.hxml`: Haxe command line file used to build the project
   * `README.md`: A basic "README.md"

1. Run the Haxe program with:
   ```
   haxe build.hxml
   ```

