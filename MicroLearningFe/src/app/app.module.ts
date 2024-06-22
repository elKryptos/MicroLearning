import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { CorsiComponent } from './corsi/corsi.component';
import { CategorieComponent } from './categorie/categorie.component';
import { HomepageComponent } from './homepage/homepage.component';
import { CorsiByCategoriaComponent } from './corsi-by-categoria/corsi-by-categoria.component';
import { LezioniComponent } from './lezioni/lezioni.component';
import { TestoComponent } from './testo/testo.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CorsiComponent,
    CategorieComponent,
    HomepageComponent,
    CorsiByCategoriaComponent,
    LezioniComponent,
    TestoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
