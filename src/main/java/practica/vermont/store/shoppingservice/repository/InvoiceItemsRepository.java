package practica.vermont.store.shoppingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practica.vermont.store.shoppingservice.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem, Long> {
}
