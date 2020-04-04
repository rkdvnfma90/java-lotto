package step2.view;

import step2.domain.Lotto;
import step2.domain.LottoConstant;

import java.util.List;

public class ResultView {

    public ResultView() {

    }

    public void printTickets(List<Lotto> lottoTickets) {
        StringBuilder sb = new StringBuilder();

        for (Lotto lotto : lottoTickets) {
            sb.append(LottoConstant.START_SEPERATOR);
            sb.append(printLottoNumber(lotto));
            sb.append(LottoConstant.END_SEPERATOR);
            sb.append(LottoConstant.ENTER);
        }
        print(sb.toString());
    }

    public String printLottoNumber(Lotto lotto) {
        StringBuilder sb = new StringBuilder();
        sb.append(lotto.getNumbers().get(0));
        for (int i = 1; i < lotto.getNumbers().size(); i++) {
            sb.append(LottoConstant.SPLIT_SEPERATOR);
            sb.append(lotto.getNumbers().get(i));

        }
        return sb.toString();
    }

    public void print(String input) {
        System.out.println(input);
    }
}
