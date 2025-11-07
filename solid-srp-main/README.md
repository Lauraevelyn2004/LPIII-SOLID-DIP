# Single-Responsibility Principle (SRP)

### Projeto refatorado de https://github.com/emerson-prof-carvalho/solid-srp-violation.

#### Solução
A classe `Invoice` somente calula o total.
- A formatação é feita pela classe `StringInvoiceFormatter`;
- A notificação é feita pela classe `EmailSender`.
