import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AfficheMatiereComponent } from './affiche-matiere.component';

describe('AfficheMatiereComponent', () => {
  let component: AfficheMatiereComponent;
  let fixture: ComponentFixture<AfficheMatiereComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AfficheMatiereComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AfficheMatiereComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
