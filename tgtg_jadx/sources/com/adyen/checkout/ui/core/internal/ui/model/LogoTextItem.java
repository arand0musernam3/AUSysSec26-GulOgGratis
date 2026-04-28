package com.adyen.checkout.ui.core.internal.ui.model;

import a80.a;
import com.adyen.checkout.core.Environment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem;", "", "getViewType", "Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem$LogoTextItemViewType;", "LogoItem", "LogoTextItemViewType", "TextItem", "Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem$LogoItem;", "Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem$TextItem;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LogoTextItem {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem$LogoItem;", "Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem;", "logoPath", "", "environment", "Lcom/adyen/checkout/core/Environment;", "(Ljava/lang/String;Lcom/adyen/checkout/core/Environment;)V", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getLogoPath", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "getViewType", "Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem$LogoTextItemViewType;", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LogoItem implements LogoTextItem {

        @NotNull
        private final Environment environment;

        @NotNull
        private final String logoPath;

        public LogoItem(@NotNull String str, @NotNull Environment environment) {
            str.getClass();
            environment.getClass();
            this.logoPath = str;
            this.environment = environment;
        }

        public static /* synthetic */ LogoItem copy$default(LogoItem logoItem, String str, Environment environment, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = logoItem.logoPath;
            }
            if ((i11 & 2) != 0) {
                environment = logoItem.environment;
            }
            return logoItem.copy(str, environment);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLogoPath() {
            return this.logoPath;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Environment getEnvironment() {
            return this.environment;
        }

        @NotNull
        public final LogoItem copy(@NotNull String logoPath, @NotNull Environment environment) {
            logoPath.getClass();
            environment.getClass();
            return new LogoItem(logoPath, environment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogoItem)) {
                return false;
            }
            LogoItem logoItem = (LogoItem) other;
            return Intrinsics.areEqual(this.logoPath, logoItem.logoPath) && Intrinsics.areEqual(this.environment, logoItem.environment);
        }

        @NotNull
        public final Environment getEnvironment() {
            return this.environment;
        }

        @NotNull
        public final String getLogoPath() {
            return this.logoPath;
        }

        @Override // com.adyen.checkout.ui.core.internal.ui.model.LogoTextItem
        @NotNull
        public LogoTextItemViewType getViewType() {
            return LogoTextItemViewType.Logo;
        }

        public int hashCode() {
            return this.environment.hashCode() + (this.logoPath.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "LogoItem(logoPath=" + this.logoPath + ", environment=" + this.environment + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem$LogoTextItemViewType;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "Logo", "Text", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LogoTextItemViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LogoTextItemViewType[] $VALUES;
        public static final LogoTextItemViewType Logo = new LogoTextItemViewType("Logo", 0, 0);
        public static final LogoTextItemViewType Text = new LogoTextItemViewType("Text", 1, 1);
        private final int type;

        private static final /* synthetic */ LogoTextItemViewType[] $values() {
            return new LogoTextItemViewType[]{Logo, Text};
        }

        static {
            LogoTextItemViewType[] logoTextItemViewTypeArr$values = $values();
            $VALUES = logoTextItemViewTypeArr$values;
            $ENTRIES = n.w(logoTextItemViewTypeArr$values);
        }

        private LogoTextItemViewType(String str, int i11, int i12) {
            this.type = i12;
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static LogoTextItemViewType valueOf(String str) {
            return (LogoTextItemViewType) Enum.valueOf(LogoTextItemViewType.class, str);
        }

        public static LogoTextItemViewType[] values() {
            return (LogoTextItemViewType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem$TextItem;", "Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem;", "textResId", "", "(I)V", "getTextResId", "()I", "component1", "copy", "equals", "", "other", "", "getViewType", "Lcom/adyen/checkout/ui/core/internal/ui/model/LogoTextItem$LogoTextItemViewType;", "hashCode", "toString", "", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextItem implements LogoTextItem {
        private final int textResId;

        public TextItem(int i11) {
            this.textResId = i11;
        }

        public static /* synthetic */ TextItem copy$default(TextItem textItem, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = textItem.textResId;
            }
            return textItem.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTextResId() {
            return this.textResId;
        }

        @NotNull
        public final TextItem copy(int textResId) {
            return new TextItem(textResId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextItem) && this.textResId == ((TextItem) other).textResId;
        }

        public final int getTextResId() {
            return this.textResId;
        }

        @Override // com.adyen.checkout.ui.core.internal.ui.model.LogoTextItem
        @NotNull
        public LogoTextItemViewType getViewType() {
            return LogoTextItemViewType.Text;
        }

        public int hashCode() {
            return Integer.hashCode(this.textResId);
        }

        @NotNull
        public String toString() {
            return k.h(this.textResId, "TextItem(textResId=", ")");
        }
    }

    @NotNull
    LogoTextItemViewType getViewType();
}
