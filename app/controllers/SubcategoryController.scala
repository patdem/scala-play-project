package controllers

import play.api.mvc._
import javax.inject._

@Singleton
class SubcategoryController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getSubcategory(id: Long): Action[AnyContent] = Action.async {
    println("getCategory:", id)
  }

  def addSubcategory(): Action[AnyContent] = Action.async { implicit request =>
    println("createCategory:", request.body)
  }

  def updateSubcategory(id: Long): Action[AnyContent] = Action.async { implicit request =>
    println("updateCategory:", request.body)
  }

  def deleteSubcategory(id: Long): Action[AnyContent] = Action.async {
    println("deleteCategory:", id)
  }
}