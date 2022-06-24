import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatDividerModule } from '@angular/material/divider';
import { SidebarComponent } from './sidebar/sidebar.component';
import { AfficheAbsencesComponent } from './absences/affiche-absences/affiche-absences.component';
import { AfficheMatiereComponent } from './matieres/affiche-matiere/affiche-matiere.component';
import { AfficheSeanceComponent } from './seances/affiche-seance/affiche-seance.component';
import { ListePromoComponent } from './promotions/liste-promo/liste-promo.component';
import { ProfesseursComponent } from './utilisateurs/professeurs/professeurs.component';
import { EtudiantsComponent } from './utilisateurs/etudiants/etudiants.component';
import { AddUserComponent } from './utilisateurs/add-user/add-user.component';

@NgModule({
  declarations: [AppComponent, SidebarComponent, AfficheAbsencesComponent, AfficheMatiereComponent, AfficheSeanceComponent, ListePromoComponent, ProfesseursComponent, EtudiantsComponent, AddUserComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatSidenavModule,
    MatButtonModule,
    MatIconModule,
    MatDividerModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
