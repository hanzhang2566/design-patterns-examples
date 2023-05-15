package command

import "testing"

func Test01(t *testing.T) {
	stock := Stock{
		name:     "hanzhang",
		quantity: 200,
	}
	broker := Broker{}
	broker.addOrder(BuyStock{stock: stock})
	broker.addOrder(SellStock{stock: stock})
	broker.execute()
}
