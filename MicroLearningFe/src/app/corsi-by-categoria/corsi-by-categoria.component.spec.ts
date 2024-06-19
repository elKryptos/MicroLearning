import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CorsiByCategoriaComponent } from './corsi-by-categoria.component';

describe('CorsiByCategoriaComponent', () => {
  let component: CorsiByCategoriaComponent;
  let fixture: ComponentFixture<CorsiByCategoriaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CorsiByCategoriaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CorsiByCategoriaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
