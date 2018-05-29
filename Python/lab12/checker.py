# 07/Jul/1995:10:49:28 до 08/Jul/1995:19:35:11 /HEAD

import re

def search():
    countFile = 0
    with open('access_log_Jul95') as text:
        for line in text:
            if re.search('(07/Jul/1995:)(\d\d:\d\d:[3-5]\d).*(HEAD)\s.+.* ',
                        str(line)) or re.search('(07/Jul/1995:)([1-5][0-9]:49:2[8-9]).*(HEAD)\s.+.* ',
                        str(line)) or re.search('(08/Jul/1995:)([0-1][0-9]:3[0-5]:0[0-9]).*(HEAD)\s.+.* ',
                        str(line)) or re.search('(08/Jul/1995:)([0-1][0-9]:[0-2][0-9]:1[0-1]).*(HEAD)\s.+.* ', str(line)):
                countFile += 1

                print(line)
                print(countFile)


if __name__ == "__main__":
    search()
