package lighting.talks;

import java.util.Objects;

public class PhoneNumber {

    public int lineNumber, prefix, areaCode;

    public PhoneNumber(int lineNumber, int prefix, int areaCode) {
        this.lineNumber = lineNumber;
        this.prefix = prefix;
        this.areaCode = areaCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (!(obj instanceof PhoneNumber))
            return false;

        PhoneNumber pn = (PhoneNumber) obj;

        return pn.lineNumber == this.lineNumber
                && pn.prefix == this.prefix
                && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.lineNumber, this.prefix, this.areaCode);
    }
}
