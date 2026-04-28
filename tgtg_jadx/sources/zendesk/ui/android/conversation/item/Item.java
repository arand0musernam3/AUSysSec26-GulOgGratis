package zendesk.ui.android.conversation.item;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0014JL\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lzendesk/ui/android/conversation/item/Item;", "T", "", "id", "", MessageBundle.TITLE_ENTRY, "titleColor", "", "subtitle", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;)V", "getId", "()Ljava/lang/String;", "getTitle", "getTitleColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubtitle", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;)Lzendesk/ui/android/conversation/item/Item;", "equals", "", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Item<T> {
    public static final int $stable = 0;

    @NotNull
    private final String id;

    @Nullable
    private final String subtitle;

    @NotNull
    private final String title;

    @Nullable
    private final Integer titleColor;

    @Nullable
    private final T value;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Item(java.lang.String r2, java.lang.String r3, java.lang.Integer r4, java.lang.String r5, java.lang.Object r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto Lc
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
        Lc:
            r8 = r7 & 2
            if (r8 == 0) goto L12
            java.lang.String r3 = ""
        L12:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L18
            r4 = r0
        L18:
            r8 = r7 & 8
            if (r8 == 0) goto L1d
            r5 = r0
        L1d:
            r7 = r7 & 16
            if (r7 == 0) goto L28
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2e
        L28:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2e:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.ui.android.conversation.item.Item.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Item copy$default(Item item, String str, String str2, Integer num, String str3, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = item.id;
        }
        if ((i11 & 2) != 0) {
            str2 = item.title;
        }
        if ((i11 & 4) != 0) {
            num = item.titleColor;
        }
        if ((i11 & 8) != 0) {
            str3 = item.subtitle;
        }
        if ((i11 & 16) != 0) {
            obj = item.value;
        }
        Object obj3 = obj;
        Integer num2 = num;
        return item.copy(str, str2, num2, str3, obj3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final T component5() {
        return this.value;
    }

    @NotNull
    public final Item<T> copy(@NotNull String id2, @NotNull String title, @Nullable Integer titleColor, @Nullable String subtitle, @Nullable T value) {
        id2.getClass();
        title.getClass();
        return new Item<>(id2, title, titleColor, subtitle, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Item)) {
            return false;
        }
        Item item = (Item) other;
        return Intrinsics.areEqual(this.id, item.id) && Intrinsics.areEqual(this.title, item.title) && Intrinsics.areEqual(this.titleColor, item.titleColor) && Intrinsics.areEqual(this.subtitle, item.subtitle) && Intrinsics.areEqual(this.value, item.value);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    @Nullable
    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int iB = l1.b(this.id.hashCode() * 31, 31, this.title);
        Integer num = this.titleColor;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        T t9 = this.value;
        return iHashCode2 + (t9 != null ? t9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        Integer num = this.titleColor;
        String str3 = this.subtitle;
        T t9 = this.value;
        StringBuilder sbT = f.t("Item(id=", str, ", title=", str2, ", titleColor=");
        sbT.append(num);
        sbT.append(", subtitle=");
        sbT.append(str3);
        sbT.append(", value=");
        sbT.append(t9);
        sbT.append(")");
        return sbT.toString();
    }

    public Item(@NotNull String str, @NotNull String str2, @Nullable Integer num, @Nullable String str3, @Nullable T t9) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.title = str2;
        this.titleColor = num;
        this.subtitle = str3;
        this.value = t9;
    }

    public Item() {
        this(null, null, null, null, null, 31, null);
    }
}
