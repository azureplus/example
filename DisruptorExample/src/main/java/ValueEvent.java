import com.lmax.disruptor.EventFactory;

/**
 * Created by dev on 8/20/15.
 */
public class ValueEvent
{
    private String value;

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public void setValue(int Value)
    {
        this.value = value + "";
    }

    public final static EventFactory<ValueEvent> EVENT_FACTORY = new EventFactory<ValueEvent>()
    {
        public ValueEvent newInstance()
        {
            return new ValueEvent();
        }
    };
}