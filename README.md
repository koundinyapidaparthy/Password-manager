# Password-Generator

This project is a Java Console Application to generate random passwords and perform password strength checks.

## Introduction

I decided to build this project during the Winter Break of my second year after taking the Object-Oriented Effective Java Programming course. I wanted to build something interesting with Java to practice and see what I could do on my own. However, I still wasn't sure what I wanted to do. Then one night, while explaining to my father the importance of having a strong password for his social media accounts, I got the idea of creating a random password generator. A week later, it was done.

While working on it, I decided to include a password strength checker feature that checks the overall strength of the entered password. I was pretty happy with how it turned out, but I realized that it was not very straightforward to use for someone who does not know how it is supposed to work. So, I decided to create a GUI for the application for the next step, which is available in the Password-Services repository.

## Functionalities

### 1. Generating a Password:

- The user answers with "Yes" or "No" to questions about using uppercase letters, lowercase letters, numbers, or symbols.
- The user then enters the desired length of the password.
- A password alphabet is generated based on the user's answers, which is a string containing the chosen characters.
- Random characters from the password alphabet are selected and combined to form a completely random string according to the user's preferences.
- The randomly generated password is then displayed on the console.

### 2. Checking a Password's Strength:

The strength check is based on the following criteria:

- The password uses uppercase letters.
- The password uses lowercase letters.
- The password uses numbers.
- The password uses symbols.
- The length of the password is 8 or more (8 is often the minimum required length for a decent password).
- The length of the password is 16 or more (16 is considered to be the minimum length for a good password).

These criteria are used to calculate a score for the password, which determines the message displayed to the user indicating the strength of the password (weak/medium/good/great).

### 3. Displaying Useful Information:

This is a minor feature that displays information for the user on the console about password security, such as avoiding using the same password twice, avoiding character repetition, keyboard patterns, dictionary words, letter or number sequences, etc.

## 4.Search A String In Your Password

The Knuth-Morris-Pratt (KMP) algorithm is a string-matching algorithm that efficiently finds all occurrences of a pattern string P within a text string T. It was developed by Donald Knuth, Vaughan Pratt, and James H. Morris, hence the name KMP.
The main idea behind the KMP algorithm is to avoid unnecessary character comparisons by taking advantage of the information gained from previous comparisons. It does this by precomputing a longest proper prefix that is also a suffix (referred to as the "failure function" or "prefix function") for each prefix of the pattern.

The time complexity of the KMP algorithm is O(m + n), where m is the length of the pattern and n is the length of the text. This makes it more efficient than naive string-matching algorithms, especially when the pattern is long or when the text is large.

Explanation:
Password: ABCABCDABEDABCDDABCDABDE
String you want check: ABCDABD
It starts with ABC and then it founds A ( Wrong Character )Then it starts from 4th index thereafter it start checking ABCDAB and then

It starts from 10th index E and which not equal to A.
Moves to next Character D and which is also not equal to A.
Then Again Next Character ABCD and then You get D which is not in the right format which we want. So it will again stars from that index.
Then it again found D which is not equal to A.
And the next character starts with A. And BCDABD
Her Comes our output.

http://whocouldthat.be/visualizing-string-matching/
