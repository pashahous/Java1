package JavaSelfeduOOP.l17;

import java.util.HashMap;
import java.util.Map;

public class MusicalInstrumentsPropertys {
    private String instrumentName;
    private int instrumentType;

    public MusicalInstrumentsPropertys(String instrumentName, int instrumentType, Dimensions dimensions) {
        this.instrumentName = instrumentName;
        this.instrumentType = instrumentType;
        this.dimensions = (checkDimension(dimensions)) ? dimensions : null;
        if (this.dimensions == null ) throw new RuntimeException("Invalid parametr of dimension ");
        Stats.addItem(instrumentType);
    }


    @Override
    public String toString() {
        return "MusicalInstrumentsPropertys{" +
                "instrumentName='" + instrumentName + '\'' +
                ", instrumentType=" + instrumentType +
                ", dimensions=" + dimensions +
                '}';
    }

    private boolean  checkDimension(Dimensions dim) {
        if (dim.getHeight() <= 0 || dim.getBold() <=0 || dim.getWidth() <=0) return false;
        return true;
    }


    Dimensions dimensions;


    static class Stats {
        static Map<Integer, Integer> stats = new HashMap<>();
        static int count = 0;

        static void addItem(Integer type) {
            if (!stats.containsKey(type)) {
                stats.put(type, 1);
                System.out.printf("[]Create new stat Instrument = %d ; count = %d \n", type, stats.get(type));
            } else {
                Integer prevValue = stats.put(type, stats.get(type) + 1);
                System.out.printf("[]Update stat!! Instrument = %d ; \n previosValue = %d; \n newValue = %d \n",type,prevValue,prevValue+1);
            }

            }


        }




    }
