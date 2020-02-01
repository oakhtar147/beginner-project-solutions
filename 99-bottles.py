import inflect

p = inflect.engine()

numbers = range(99, 0, -1)
worded_nums = range(1, 100)

# worded_num contains English words for the given number range.
worded_num = [p.number_to_words(num) for num in worded_nums]

index = 0

lyric = '{} bottles of beer on the wall. {} bottles of beer.'
lyric2 = '\nTook {} down and passed it around, {} bottles of beer on the wall.\n'

for num in numbers:
    if index == 0 or num != 1:
        print((lyric+lyric2).format(num, num, worded_num[index], num-1))
        index += 1
    else:
        if num == 1:
            print((lyric.replace("bottles", "bottle") +
                   lyric2).format(num, num, worded_num[index], num-1))
            index += 1

print("No more bottles of beer on the wall, no more bottles of beer.\n" +
      "Go to the store and buy some more, 99 bottles of beer on the wall.")
