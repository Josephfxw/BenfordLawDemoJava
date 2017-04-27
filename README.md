# BenfordLawDemoJava

 
According to Benford’s law, in data in some large-enough numerical datasets, the first significant digit is 1 much more often than would be expected; in fact, 1 occurs as the first significant digit in the data almost 30% of the time, and 9 occurs less than 5% of the time. (We would expect each to occur one-ninth, or about 11%, of the time if each digit were equally likely to occur as the first significant digit.)

According to Benford’s law, each digit occurs as the first significant digit in a dataset as follows:
- Use it in Activity or Fragment
- Select images including JPEG, PNG, GIF and videos including MPEG, MP4 
- Apply different themes, including two built-in themes and custom themes
- Different image loaders
- Define custom filter rules
- More to find out yourself

| Digit                          |    Percentage                     | 
|:------------------------------:|:---------------------------------:|
| 1                              |30.103%                            |
| 2                              |17.609%                            |
| 3                              |12.494%                            |
| 4                              |9.691%                             |
| 5                              |7.918%                             |
| 6                              |6.695%                             |
| 7                              |5.799%                             |
| 8                              |5.115%                             |
| 9                              |4.576%                             |


We want to computationally determine if the data in a given dataset follows Benford’s law.

## Input
The file data.txt, which contains our dataset as rows of numerical data, with each row representing one unit of data.

## Output
The percentage of occurrence of each digit as the first significant digit in the data, represented both numerically and visually.

Your output should appear as follows:

1  (4.550%) : ***** <br>
2  (32.123%) : ********************************<br>
3  (23.623%) : ************************<br>
4  (8.322%) : ********<br>
5  (3.484%) : ***<br>
6  (10.008%) : **********<br>
7  (7.555%) : ********<br>
8  (1.892%) : **<br>
9  (8.443%) : ********<br>
