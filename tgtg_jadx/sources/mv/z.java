package mv;

import com.adyen.checkout.googlepay.AllowedCardNetworks;
import com.app.tgtg.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z BROWSE;
    public static final z DISCOVER;
    public static final z FAVORITES;
    public static final z LIST;
    public static final z MANUFACTURER;
    public static final z MAP;
    public static final z MY_STORE;
    public static final z MY_STORE_MORE;
    public static final z PROFILE;
    private final int menuId;

    static {
        z zVar = new z(AllowedCardNetworks.DISCOVER, 0, R.id.item_discover);
        DISCOVER = zVar;
        z zVar2 = new z("BROWSE", 1, R.id.item_browse);
        BROWSE = zVar2;
        z zVar3 = new z("LIST", 2, R.id.item_browse);
        LIST = zVar3;
        z zVar4 = new z("MAP", 3, R.id.item_browse);
        MAP = zVar4;
        z zVar5 = new z("FAVORITES", 4, R.id.item_favourites);
        FAVORITES = zVar5;
        z zVar6 = new z("MANUFACTURER", 5, R.id.item_manufacturer);
        MANUFACTURER = zVar6;
        z zVar7 = new z("PROFILE", 6, R.id.item_profile);
        PROFILE = zVar7;
        z zVar8 = new z("MY_STORE", 7, R.id.item_my_store);
        MY_STORE = zVar8;
        z zVar9 = new z("MY_STORE_MORE", 8, R.id.item_my_store_more);
        MY_STORE_MORE = zVar9;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9};
        $VALUES = zVarArr;
        $ENTRIES = new a80.b(zVarArr);
    }

    public z(String str, int i11, int i12) {
        this.menuId = i12;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    public final int a() {
        return this.menuId;
    }
}
