import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategorieComponent } from './categorie/categorie.component';
import { CorsiComponent } from './corsi/corsi.component';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { CorsiByCategoriaComponent } from './corsi-by-categoria/corsi-by-categoria.component';
import { LezioniComponent } from './lezioni/lezioni.component';
import { TestoComponent } from './testo/testo.component';
import { RicercaComponent } from './ricerca/ricerca.component';

const routes: Routes = [
  {path: "homepage", component: HomepageComponent}, 
  {path: "categorie", component: CategorieComponent}, 
  {path: "corsi", component: CorsiComponent}, 
  {path: "corsi/:id", component: LezioniComponent}, 
  {path: "lezioni/:id", component: LezioniComponent},
  {path: "testo/:id", component: TestoComponent},
  {path: "login", component: LoginComponent}, 
  {path: "categorie/:categoria", component: CorsiByCategoriaComponent},
  {path:"ricerca", component: RicercaComponent},
  //{path: "**", redirectTo: "/homepage"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
