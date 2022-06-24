import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AfficheAbsencesComponent } from './affiche-absences.component';

describe('AfficheAbsencesComponent', () => {
  let component: AfficheAbsencesComponent;
  let fixture: ComponentFixture<AfficheAbsencesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AfficheAbsencesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AfficheAbsencesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
