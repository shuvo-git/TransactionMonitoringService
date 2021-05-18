package padma.tr_monitor.transactions;

import lombok.*;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import java.time.ZonedDateTime;
import java.util.Date;



@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Document(collection = "transactions")
public class Transaction
{
    @Id
    private String trId;
    private String generationTime;
    private String ip;
    private String amount;
    private String debitOrCredit;
    private String accountNo;
    private String customerName;
    private String customerContact;
    private TransactionState state;
    private String status;

}
