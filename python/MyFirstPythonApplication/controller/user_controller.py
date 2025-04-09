from flask import Blueprint, jsonify, request
from service.user_service import UserService

user_blueprint = Blueprint('user_blueprint', __name__)


# @user_blueprint.route('/us', methods=['GET'])
# def trail():
#     return "im working"


@user_blueprint.route('/users', methods=['GET'])
def get_users():
    users = UserService.get_all_users()
    return jsonify([user.to_dict() for user in users])


@user_blueprint.route('/users', methods=['POST'])
def create_user():
    data = request.get_json()
    new_user = UserService.create_user(data)
    return jsonify({"message": "User created", "user": new_user.to_dict()}), 201


@user_blueprint.route('/users/<int:user_id>', methods=['DELETE'])
def delete_user(user_id):
    success = UserService.delete_user(user_id)
    if success:
        return jsonify({"message": "User deleted"}), 200
    return jsonify({"message": "User not found"}), 404
