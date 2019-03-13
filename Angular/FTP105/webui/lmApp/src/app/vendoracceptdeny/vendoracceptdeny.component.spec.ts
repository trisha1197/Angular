import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VendoracceptdenyComponent } from './vendoracceptdeny.component';

xdescribe('VendoracceptdenyComponent', () => {
  let component: VendoracceptdenyComponent;
  let fixture: ComponentFixture<VendoracceptdenyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VendoracceptdenyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VendoracceptdenyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
