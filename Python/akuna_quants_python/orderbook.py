import sys


class OrderBook:
    def __init__(self):



    def buy(self, order_id, price):



    def sell(self, order_id):



    def get_high_price(self):



book = OrderBook()
for line in sys.stdin:
    elements = line.split(' ')
    time_order = int(elements[0])
    type_order = elements[1]
    id_order = int(elements[2])
    price_order = None
    if len(elements) == 4:
        price_order = float(elements[3])
