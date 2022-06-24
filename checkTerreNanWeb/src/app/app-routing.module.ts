import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AfficheAbsencesComponent } from './absences/affiche-absences/affiche-absences.component';
import { AfficheMatiereComponent } from './matieres/affiche-matiere/affiche-matiere.component';
import { ListePromoComponent } from './promotions/liste-promo/liste-promo.component';
import { ProfesseursComponent } from './utilisateurs/professeurs/professeurs.component';
import { EtudiantsComponent } from './utilisateurs/etudiants/etudiants.component';
import { AddUserComponent } from './utilisateurs/add-user/add-user.component';
import { AfficheSeanceComponent } from './seances/affiche-seance/affiche-seance.component';

const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'home',
  },
  {
    path: 'absences',
    component: AfficheAbsencesComponent,
  },
  {
    path: 'matiere',
    component: AfficheMatiereComponent,
  },
  {
    path: 'promotions',
    component: ListePromoComponent,
  },
  {
    path: 'professeurs',
    component: ProfesseursComponent,
  },
  {
    path: 'etudiants',
    component: EtudiantsComponent,
  },
  {
    path: 'seances',
    component: AfficheSeanceComponent,
  },
  {
    path: 'adduser',
    component: AddUserComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
