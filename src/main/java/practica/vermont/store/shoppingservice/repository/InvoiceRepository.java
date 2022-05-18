package practica.vermont.store.shoppingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practica.vermont.store.shoppingservice.entity.Invoice;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    public List<Invoice> findByCustomerId(Long customerId);
    public Invoice findByNumberInvoice(String numberInvoice);
}
