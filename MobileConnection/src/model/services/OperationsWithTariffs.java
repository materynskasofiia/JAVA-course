package model.services;

import model.tariffs.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperationsWithTariffs {

    private MobileTariff createContractTariff(Tariffs TARIFF){
        return new ContractTariff(TARIFF.getName(), TARIFF.getSpecialForParticular(),TARIFF.getGbOfData(),
                TARIFF.getTexts(),TARIFF.getMinutes(), TARIFF.getPrice());
    }

    private MobileTariff createAsYouGoTariff(Tariffs TARIFF){
        return new AsYouGoTariff(TARIFF.getName(), TARIFF.getSpecialForParticular(),TARIFF.getGbOfData(),
                TARIFF.getTexts(),TARIFF.getMinutes(), TARIFF.getPrice());
    }

    private MobileTariff createInternationalTariff(Tariffs TARIFF){
        return new InternationalTariff(TARIFF.getName(), TARIFF.getSpecialForParticular(),
                TARIFF.getSpecialForParticular2(), TARIFF.getGbOfData(), TARIFF.getTexts(),
                TARIFF.getMinutes(), TARIFF.getPrice());
    }

    public MobileTariff createTariff(Tariffs tariff){
        switch (tariff){
            case CONTRACT_TARIFF_1 :
            case CONTRACT_TARIFF_2:
            case CONTRACT_TARIFF_3:
                return createContractTariff(tariff);
            case PAY_AS_YOU_GO_1:
            case PAY_AS_YOU_GO_2:
            case PAY_AS_YOU_GO_3:
                return createAsYouGoTariff(tariff);
            case INTERNATIONAL_TARIFF_1:
            case INTERNATIONAL_TARIFF_2:
            case INTERNATIONAL_TARIFF_3:
                return createInternationalTariff(tariff);
            default:
                return null;
        }
    }
}
