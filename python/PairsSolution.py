#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'sockMerchant' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER n
#  2. INTEGER_ARRAY ar
#

def sockMerchant(n, ar):
    num = 0
    for i in range(0,n):
        gum = 1
        for j in range(i+1,n):
            if ar[i] == None:
                continue
            if ar[i] == ar[j] and gum ==1:
                num = num + 1
                gum = gum + 1
                ar[j] = None

    return num

if __name__ == '__main__':
    n = int(input().strip())

    ar = list(map(int, input().rstrip().split()))

    result = sockMerchant(n, ar)
    print(result)
