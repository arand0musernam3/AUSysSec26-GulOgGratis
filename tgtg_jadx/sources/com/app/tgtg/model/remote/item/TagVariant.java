package com.app.tgtg.model.remote.item;

import a80.a;
import com.app.tgtg.R;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = TagVariantSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/app/tgtg/model/remote/item/TagVariant;", "", "legacyResId", "", "resId", "<init>", "(Ljava/lang/String;III)V", "getLegacyResId", "()I", "getResId", "POPULAR", "HIDDEN_GEM", "RARE_FIND", "SELLING_FAST", "NEW_TAG", "DINE_IN", "LOCAL_HERO", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TagVariant {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TagVariant[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int legacyResId;
    private final int resId;
    public static final TagVariant POPULAR = new TagVariant("POPULAR", 0, R.drawable.crown, R.drawable.tag_popular);
    public static final TagVariant HIDDEN_GEM = new TagVariant("HIDDEN_GEM", 1, R.drawable.diamond, R.drawable.tag_hidden_gem);
    public static final TagVariant RARE_FIND = new TagVariant("RARE_FIND", 2, R.drawable.magnifier, R.drawable.tag_rare_find);
    public static final TagVariant SELLING_FAST = new TagVariant("SELLING_FAST", 3, R.drawable.rocket, R.drawable.tag_selling_fast);
    public static final TagVariant NEW_TAG = new TagVariant("NEW_TAG", 4, R.drawable.tag, R.drawable.tag_new);
    public static final TagVariant DINE_IN = new TagVariant("DINE_IN", 5, R.drawable.meal_icon, R.drawable.blob_gray_doodle_meal);
    public static final TagVariant LOCAL_HERO = new TagVariant("LOCAL_HERO", 6, R.drawable.local_hero_blob_full, R.drawable.local_hero_blob_full);
    public static final TagVariant UNKNOWN = new TagVariant("UNKNOWN", 7, R.drawable.tag, R.drawable.tag_new);

    private static final /* synthetic */ TagVariant[] $values() {
        return new TagVariant[]{POPULAR, HIDDEN_GEM, RARE_FIND, SELLING_FAST, NEW_TAG, DINE_IN, LOCAL_HERO, UNKNOWN};
    }

    static {
        TagVariant[] tagVariantArr$values = $values();
        $VALUES = tagVariantArr$values;
        $ENTRIES = n.w(tagVariantArr$values);
        INSTANCE = new Companion(null);
    }

    private TagVariant(String str, int i11, int i12, int i13) {
        this.legacyResId = i12;
        this.resId = i13;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static TagVariant valueOf(String str) {
        return (TagVariant) Enum.valueOf(TagVariant.class, str);
    }

    public static TagVariant[] values() {
        return (TagVariant[]) $VALUES.clone();
    }

    public final int getLegacyResId() {
        return this.legacyResId;
    }

    public final int getResId() {
        return this.resId;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/TagVariant$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/TagVariant;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TagVariantSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
