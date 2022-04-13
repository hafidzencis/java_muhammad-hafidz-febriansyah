#!/bin/bash
timestamp=$(date +%c)

echo "Starting the automation process $1"
echo "Creating directory"

myDir = "$1 at $timestamp"

#command mkdir

mkdir -p "$myDir"
mkdir -p "$myDir/aboutme"

personal = "$myDir/about_me/personal"
mkdir -p "$personal"
facebook = echo "https://web.facebook.com/hafidz.sid" > facebook.txt
mv "$personal" "$facebook"

profesional="$myDir/about_me/profesional"
mkdir -p "$profesional"
linked = echo "https://www.linkedin.com/in/muhammad-hafidz-febriansyah-77846a202/" > linkedin.txt
mv "$profesional" "$linked"

my_friend = "$myDir/my_friends"
mkdir -p "$my_friends"
curl -o "$my_friends/list_of_my_friends.txt" https://gist.githubusercontent.com/tegarimansyah/e91f335753ab2c7fb12815779677e914/raw/94864388379fecee450fde26e3e73bfb2bcda194/list%2520of%2520my%2520friends.txt

my_sistem_info = "$myDir/my_sistem_info"
mkdir -p "$my_sistem_info"

echo "Create about laptop"
touch "$my_sistem_info/about_this_laptop.txt"
echo "My username: " + 'whoami' >> ~/"$my_sistem_info"/about_this_laptop.txt
echo "With host: " + 'uname -a' >> ~/"$my_sistem_info"/about_this_laptop.txt

touch "$my_sistem_info/internet_connection.txt"
ping -c 3 google.com >> "$my_sistem_info"/internet_connection.txt

echo "Done"
tree "$myDir"

