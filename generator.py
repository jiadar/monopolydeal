money = [(1, "yellow"), (2, "red"), (3, "green"), (4, "blue"), (5, "purple")]

for (amt, color) in money:
    print(f"deck.add(new MoneyCard(\"{amt}M\", \"${amt} million\", {amt}));")

wildcards = [(4, ['blue', 'green']),
             (1, ['ltblue', 'brown']),
             (0, ['brown', 'blue', 'green', 'ltblue', 'orange', 'purple', 'black', 'red', 'ltgreen', 'yellow']),
             (2, ['orange', 'purple']),
             (4, ['green', 'black']),
             (4, ['ltblue', 'black']),
             (2, ['ltgreen', 'black']),
             (3, ['yellow', 'red'])]

card_number=1;
for (amt, colors) in wildcards:
    colorstr = ""
    for color in colors:
        colorstr += color + "/"
    print(f"WildCard wildcard{card_number} = new WildCard(\"{colorstr[:-1]} Wild Card\", \"Use with {colorstr[:-1]} properties\", {amt});")
    for color in colors:
        print(f"wildcard{card_number}.addColor(\"{color}\");")
    print(f"deck.add(wildcard{card_number});")
    card_number += 1

for i in range(1, 108):
    print(f"{i}, ", end='')
    
