import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategorieComponent } from './categorie/categorie.component';
import { CorsiComponent } from './corsi/corsi.component';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';

const routes: Routes = [
  {path: "categorie", component: CategorieComponent}, 
  {path: "corsi", component: CorsiComponent}, 
  {path: "login", component: LoginComponent}, 
  {path: "homepage", component: HomepageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
