# Dependency Inversion Principle (DIP)

### Projeto refatorado de https://github.com/emerson-prof-carvalho/solid-dip-violation.

#### Solução
- Criação da interface `Notifier`, que abstrai a ação de enviar uma notificação. `EmailSender`, `SMSSender`, e `WhatsAppSender` implementam essa interface;
- `NotificationService` agora depende da abstração `Notifier`, e não de alguma implementação específica. Ou seja, podemos injetar qualquer implementação de `Notifier` (e-mail, SMS, WhatsApp, etc.) sem alterar `NotificationService`;
- Se quisermos adicionar novos canais de notificação, basta criar uma nova implementação de `Notifier`, sem precisar alterar a lógica de alto nível;
- Além disso, podemos combinar conjunto de notificadores (que implementam `Notifier`) e mudar os canais de notificação sem precisar alterar a lógica de alto nível `NotificationService`.
