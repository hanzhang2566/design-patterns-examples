package abs

import (
	"fmt"
	"hanzhang2566/design-patterns-examples/go-patterns/creational/factory/abs/model"
	"testing"
)

func Test01(t *testing.T) {
	user := model.User{
		Id:   1,
		Name: "hanzhang",
	}

	factory := SqliteRepositoryFactory{}
	repositoryFactory := factory.getUserRepositoryFactory()
	repositoryFactory.insert(user)
	fmt.Println(factory.getDeptRepositoryFactory().getById(-1))
}

func Test02(t *testing.T) {
	dept := model.Dept{
		Id:   -1,
		Name: "dept",
	}

	factory := MysqlRepositoryFactory{}
	fmt.Println(factory.getUserRepositoryFactory().getById(1))
	factory.getDeptRepositoryFactory().insert(dept)
}
