from dao.user_dao import UserDAO
from models.user import User


class UserService:
    @staticmethod
    def get_all_users():
        return UserDAO.get_all_users()

    @staticmethod
    def create_user(data):
        new_user = User(name=data['name'], email=data['email'])
        UserDAO.add_user(new_user)
        return new_user

    @staticmethod
    def delete_user(user_id):
        user = UserDAO.get_user_by_id(user_id)
        if user:
            UserDAO.delete_user(user)
            return True
        return False
