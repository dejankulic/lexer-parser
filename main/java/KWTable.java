import java.util.Hashtable;
public class KWTable {

    private Hashtable mTable;
    public KWTable()
    {
        // Inicijalizcaija hash tabele koja pamti kljucne reci
        mTable = new Hashtable();
        mTable.put("main", Integer.valueOf(sym.main));
        mTable.put("real", Integer.valueOf(sym.REAL));
        mTable.put("int", Integer.valueOf(sym.INT));
        mTable.put("char", Integer.valueOf(sym.CHAR));
        mTable.put("bool", Integer.valueOf(sym.BOOL));
        mTable.put("read", Integer.valueOf(sym.read));
        mTable.put("write", Integer.valueOf(sym.write));
        mTable.put("repeat", Integer.valueOf(sym.repeat));
        mTable.put("until", Integer.valueOf(sym.until));
        mTable.put("true", Integer.valueOf(sym.constanta));
        mTable.put("false", Integer.valueOf(sym.constanta));

    }

    /**
     * Vraca ID kljucne reci
     */

    public int find(String keyword)
    {
        Object symbol = mTable.get(keyword);
        if (symbol != null)
            return ((Integer)symbol).intValue();

        // Ako rec nije pronadjena u tabeli kljucnih reci radi se o identifikatoru
        return sym.id;
    }


}