package controllers

import play.api.mvc._
import javax.inject._

@Singleton
class UserController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getUser(id: Long): Action[AnyContent] = Action.async {
    println("getCategory:", id)
  }

  def addUser(): Action[AnyContent] = Action.async { implicit request =>
    println("createCategory:", request.body)
  }

  def updateUser(id: Long): Action[AnyContent] = Action.async { implicit request =>
    println("updateCategory:", request.body)
  }

  def deleteUser(id: Long): Action[AnyContent] = Action.async {
    println("deleteCategory:", id)
  }
}