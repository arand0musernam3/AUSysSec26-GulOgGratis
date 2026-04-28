package dn;

import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[AdapterItemType.values().length];
        try {
            iArr[AdapterItemType.SMALL_CARDS_CAROUSEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdapterItemType.ITEM_CARDS_CAROUSEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AdapterItemType.HIGHLIGHTED_ITEM_CARDS_CAROUSEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AdapterItemType.ITEM_CARDS_CAROUSEL_V2.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AdapterItemType.HERO_CAROUSEL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AdapterItemType.TYPED_ITEM_CARDS_CAROUSEL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
