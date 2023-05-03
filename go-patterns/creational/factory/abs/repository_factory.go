package abs

import (
	"fmt"
	"hanzhang2566/design-patterns-examples/go-patterns/creational/factory/abs/model"
)

type RepositoryFactory interface {
	getUserRepositoryFactory() UserRepositoryFactory
	getDeptRepositoryFactory() DeptRepositoryFactory
}

type MysqlRepositoryFactory struct {
}

func (mrf MysqlRepositoryFactory) getUserRepositoryFactory() UserRepositoryFactory {
	return MysqlUserRepository{}
}

func (mrf MysqlRepositoryFactory) getDeptRepositoryFactory() DeptRepositoryFactory {
	return MysqlDeptRepository{}
}

type SqliteRepositoryFactory struct {
}

func (srf SqliteRepositoryFactory) getUserRepositoryFactory() UserRepositoryFactory {
	return SqlLiteUserRepository{}
}

func (srf SqliteRepositoryFactory) getDeptRepositoryFactory() DeptRepositoryFactory {
	return SqlLiteDeptRepository{}
}

type UserRepositoryFactory interface {
	insert(user model.User)
	getById(id int) model.User
}

type MysqlUserRepository struct {
}

func (mur MysqlUserRepository) insert(user model.User) {
	fmt.Printf("mysql insert user: %v\n", user)
}

func (mur MysqlUserRepository) getById(id int) model.User {
	return model.User{
		Id:   1,
		Name: "hanzhang",
	}
}

type SqlLiteUserRepository struct {
}

func (sur SqlLiteUserRepository) insert(user model.User) {
	fmt.Printf("sqllite insert user: %v\n", user)
}

func (sur SqlLiteUserRepository) getById(id int) model.User {
	return model.User{
		Id:   1,
		Name: "sqllite-user",
	}
}

type DeptRepositoryFactory interface {
	insert(dept model.Dept)
	getById(id int) model.Dept
}

type MysqlDeptRepository struct {
}

func (mdr MysqlDeptRepository) insert(user model.Dept) {
	fmt.Printf("mysql insert user: %v\n", user)
}

func (mdr MysqlDeptRepository) getById(id int) model.Dept {
	return model.Dept{
		Id:   1,
		Name: "hanzhang",
	}
}

type SqlLiteDeptRepository struct {
}

func (sdr SqlLiteDeptRepository) insert(user model.Dept) {
	fmt.Printf("sqllite insert user: %v\n", user)
}

func (sdr SqlLiteDeptRepository) getById(id int) model.Dept {
	return model.Dept{
		Id:   1,
		Name: "sqllite-dept",
	}
}
