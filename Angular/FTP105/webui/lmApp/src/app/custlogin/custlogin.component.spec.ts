import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustloginComponent } from './custlogin.component';

xdescribe('CustloginComponent', () => {
  let component: CustloginComponent;
  let fixture: ComponentFixture<CustloginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustloginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
