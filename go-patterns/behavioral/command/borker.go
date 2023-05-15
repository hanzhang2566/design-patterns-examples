package command

type Broker struct {
	orders []Order
}

func (b *Broker) addOrder(order Order) {
	b.orders = append(b.orders, order)
}

func (b *Broker) execute() {
	for _, order := range b.orders {
		order.execute()
	}
	b.orders = []Order{}
}
