import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategorieComponent } from './categorie/categorie.component';
import { CorsiComponent } from './corsi/corsi.component';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { CorsiByCategoriaComponent } from './corsi-by-categoria/corsi-by-categoria.component';

const routes: Routes = [
  {path: "categorie", component: CategorieComponent}, 
  {path: "corsi", component: CorsiComponent}, 
  {path: "login", component: LoginComponent}, 
  {path: "homepage", component: HomepageComponent}, 
  {path: "corsiByCategoria", component: CorsiByCategoriaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
