package command

type Order interface {
	execute()
}

type BuyStock struct {
	stock Stock
}

func (by BuyStock) execute() {
	by.stock.Buy()
}

type SellStock struct {
	stock Stock
}

func (ss SellStock) execute() {
	ss.stock.Sell()
}
