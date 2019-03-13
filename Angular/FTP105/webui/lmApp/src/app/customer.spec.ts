import { Customer } from './customer';

xdescribe('Customer', () => {
  it('should create an instance', () => {
    expect(new Customer(1,'sivaram',1139.64,'siva','pass001')).toBeTruthy();
  });
});
