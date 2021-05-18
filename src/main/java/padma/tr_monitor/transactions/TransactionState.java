package padma.tr_monitor.transactions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TransactionState {
    private boolean initiate;
    private boolean verified;
    private boolean successful;
}
