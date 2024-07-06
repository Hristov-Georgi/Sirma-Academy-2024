package com.sirmaacademy.entrycourse.loopsExercises;

import java.util.Scanner;

public class AlternativeConditionsV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());


        int totalRows = 0;
        int fullRowLastNumber = 0;
        for (int i = 0; i <= number ; i++) {
            totalRows++;

            fullRowLastNumber += (i + 1);

            if (fullRowLastNumber >= number) {
                break;
            }
        }

        int startRowNumberForEmptySpacePrinting;
        int startRowLastNumber;

        if (fullRowLastNumber > number) {
            startRowNumberForEmptySpacePrinting = totalRows - 1;
            startRowLastNumber = fullRowLastNumber - startRowNumberForEmptySpacePrinting - 1;
        } else {
            startRowNumberForEmptySpacePrinting = totalRows;
            startRowLastNumber = fullRowLastNumber;
        }

        int result = startRowLastNumber - startRowNumberForEmptySpacePrinting;
        int initialSpaceFirstRow;
        if (10 <= result && result <= 91) {
            initialSpaceFirstRow = (startRowNumberForEmptySpacePrinting - 1) * 2 + startRowNumberForEmptySpacePrinting;
        } else if (result <= 10) {
            initialSpaceFirstRow = (startRowNumberForEmptySpacePrinting) * 2 - 1;
        } else if (result <= 105) {
            initialSpaceFirstRow = 8 * 2 + 5 * 3 + startRowNumberForEmptySpacePrinting - 1;
        } else if (result <= 990) {
            initialSpaceFirstRow = startRowNumberForEmptySpacePrinting * 3 + startRowNumberForEmptySpacePrinting - 1;
        } else {
            initialSpaceFirstRow = startRowNumberForEmptySpacePrinting * 4 + startRowNumberForEmptySpacePrinting - 1;

        }


        int currentValue = 1;
        boolean endOfProgram = false;
        int row = 1;

        while (currentValue <= number) {

            printEmptySpace(initialSpaceFirstRow);

            if (row < 4) {
                initialSpaceFirstRow -= 2;
            } else if (row == 4) {
                initialSpaceFirstRow -= 6;
            } else if (row < 13) {
                initialSpaceFirstRow -= 3;
            } else if (row == 13) {
                initialSpaceFirstRow -= 8;
            } else if (row == 14) {
                initialSpaceFirstRow -= 12;
            } else {
                initialSpaceFirstRow -= 4;
            }

            for (int i = 1; i <= row; i++) {

                if (currentValue == number) {
                    System.out.println(currentValue);
                    endOfProgram = true;
                    break;

                } else {

                    System.out.print(currentValue + " ");

                    currentValue++;

                }
            }

            if (endOfProgram) {
                break;
            }

            System.out.println();

            row++;
        }

    }

    private static void printEmptySpace(int initialSpaceFirstRow) {

        for (int emptySpace = initialSpaceFirstRow; emptySpace > 1 ; emptySpace--) {
            System.out.print(" ");
        }

    }
}

//    1    4
//  2 3    2
//4 5 6
//    7


//      1   6
//    2 3   4
//  4 5 6   2
//7 8 9 10


//               1    15
//             2 3    13              6 реда
//           4 5 6    11
//         7 8 9 10   9
//   11 12 13 14 15   3
//16 17 18 19 20 21


//                  1    18
//                2 3    16
//              4 5 6    14          7 реда
//            7 8 9 10   12  - 6
//      11 12 13 14 15   6  - 2
//   16 17 18 19 20 21   3
//22 23 24 25 26 27 28


//                     1    21
//                   2 3    19
//                 4 5 6    17          8 реда
//               7 8 9 10   15  - 6
//         11 12 13 14 15   9          - няма зависимост за деление на 2. Зависимоста е за минус 3.
//      16 17 18 19 20 21   6
//   22 23 24 25 26 27 28   3
//29 30 31 32 33 34 35 36


//                        1    24  - 2
//                      2 3    22
//                    4 5 6    20          9 реда
//                  7 8 9 10   18  - 6   2 + 4 = 6 без горната 10ка
//            11 12 13 14 15   12  - 3
//         16 17 18 19 20 21   9
//      22 23 24 25 26 27 28   6
//   29 30 31 32 33 34 35 36   3
//37 38 39 40 41 42 43 44 45

//                                                                1       64
//                                                              2 3       62     2 през  - цифра и празно място
//                                                            4 5 6       60     2 + 4 = 6   14 - 8 == 6
//    символите на реда и празно място                      7 8 9 10      58     6 зависимост
// - първи с последен и т.н. ,втори                   11 12 13 14 15      52
//          с предпоследен и т.н.                  16 17 18 19 20 21      49     3 зависимост - 2 цифри и празно
//                                              22 23 24 25 26 27 28      46
//                                           29 30 31 32 33 34 35 36      43     2*2 + 2    3*2 + 2
//                                        37 38 39 40 41 42 43 44 45      40
//                                     46 47 48 49 50 51 52 53 54 55      37
//                                  56 57 58 59 60 61 62 63 64 65 66      34
//                               67 68 69 70 71 72 73 74 75 76 77 78      31
//                            79 80 81 82 83 84 85 86 87 88 89 90 91      28   до тук с 3 зависимост  3 + 5
//                    92 93 94 95 96 97 98 99 100 101 102 103 104 105     20  8 зависимост
//        106 107 108 109 110 111 112 113 114 115 116 117 118 119 120      8  12 зависимост
//    121 122 123 124 125 126 127 128 129 130 131 132 133 134 135 136      4  през 4
//137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153


//821 822 823 824 825 826 827 828 829 830 831 832 833 834 835 836 837 838 839 840 841 842 843 844 845 846 847 848 849 850 851 852 853 854 855 856 857 858 859 860 861
//862 863 864 865 866 867 868 869 870 871 872 873 874 875 876 877 878 879 880 881 882 883 884 885 886 887 888 889 890 891 892 893 894 895 896 897 898 899 900 901 902 903
//904 905 906 907 908 909 910 911 912 913 914 915 916 917 918 919 920 921 922 923 924 925 926 927 928 929 930 931 932 933 934 935 936 937 938 939 940 941 942 943 944 945 946
//                                                               947 948 949 950 951 952 953 954 955 956 957 958 959 960 961 962 963 964 965 966 967 968 969 970 971 972 973 974 975 976 977 978 979 980 981 982 983 984 985 986 987 988 989 990      63
//                        991 992 993 994 995 996 997 998 999 1000 1001 1002 1003 1004 1005 1006 1007 1008 1009 1010 1011 1012 1013 1014 1015 1016 1017 1018 1019 1020 1021 1022 1023 1024 1025 1026 1027 1028 1029 1030 1031 1032 1033 1034 1035     24
//          1036 1037 1038 1039 1040 1041 1042 1043 1044 1045 1046 1047 1048 1049 1050 1051 1052 1053 1054 1055 1056 1057 1058 1059 1060 1061 1062 1063 1064 1065 1066 1067 1068 1069 1070 1071 1072 1073 1074 1075 1076 1077 1078 1079 1080 1081     10
//     1082 1083 1084 1085 1086 1087 1088 1089 1090 1091 1092 1093 1094 1095 1096 1097 1098 1099 1100 1101 1102 1103 1104 1105 1106 1107 1108 1109 1110 1111 1112 1113 1114 1115 1116 1117 1118 1119 1120 1121 1122 1123 1124 1125 1126 1127 1128      5
//1129 1130 1131 1132 1133 1134 1135 1136 1137 1138 1139 1140 1141 1142 1143 1144 1145 1146 1147 1148 1149 1150 1151 1152 1153 1154 1155 1156 1157 1158 1159 1160 1161 1162 1163 1164 1165 1166 1167 1168 1169 1170 1171 1172 1173 1174 1175 1176

// 1 проверка за числото дали е < 10 или е > 10  до 10 вкл. празните редове са през 2 намаляват