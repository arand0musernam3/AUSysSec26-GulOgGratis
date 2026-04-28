package zendesk.messaging.android.internal;

import android.content.Intent;
import k80.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import n90.b;
import n90.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.android.messaging.MessagingScreen;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002:\u0006\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lzendesk/messaging/android/internal/IntentDelegate;", "T", "Lk80/d;", "Landroid/content/Intent;", "", "key", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Int", "String", "Boolean", "MessagingScreenDelegate", "Serializable", "Parcelable", "Lzendesk/messaging/android/internal/IntentDelegate$Boolean;", "Lzendesk/messaging/android/internal/IntentDelegate$Int;", "Lzendesk/messaging/android/internal/IntentDelegate$MessagingScreenDelegate;", "Lzendesk/messaging/android/internal/IntentDelegate$Parcelable;", "Lzendesk/messaging/android/internal/IntentDelegate$Serializable;", "Lzendesk/messaging/android/internal/IntentDelegate$String;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class IntentDelegate<T> implements d {

    @NotNull
    private final java.lang.String key;

    private IntentDelegate(java.lang.String str) {
        this.key = str;
    }

    @NotNull
    public final java.lang.String getKey() {
        return this.key;
    }

    @Override // k80.c
    public abstract /* synthetic */ Object getValue(Object obj, @NotNull KProperty kProperty);

    @Override // k80.d
    public abstract /* synthetic */ void setValue(Object obj, @NotNull KProperty kProperty, Object obj2);

    public /* synthetic */ IntentDelegate(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/IntentDelegate$Boolean;", "Lzendesk/messaging/android/internal/IntentDelegate;", "", "key", "", "defaultValue", "<init>", "(Ljava/lang/String;Z)V", "getValue", "thisRef", "Landroid/content/Intent;", "property", "Lkotlin/reflect/KProperty;", "(Landroid/content/Intent;Lkotlin/reflect/KProperty;)Ljava/lang/Boolean;", "setValue", "", "value", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Boolean extends IntentDelegate<java.lang.Boolean> {
        private final boolean defaultValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Boolean(@NotNull java.lang.String str, boolean z11) {
            super(str, null);
            str.getClass();
            this.defaultValue = z11;
        }

        @NotNull
        public java.lang.Boolean getValue(@NotNull Intent thisRef, @NotNull KProperty<?> property) {
            thisRef.getClass();
            property.getClass();
            return java.lang.Boolean.valueOf(thisRef.getBooleanExtra(getKey(), this.defaultValue));
        }

        public void setValue(@NotNull Intent thisRef, @NotNull KProperty<?> property, boolean value) {
            thisRef.getClass();
            property.getClass();
            thisRef.putExtra(getKey(), value);
        }

        @Override // zendesk.messaging.android.internal.IntentDelegate, k80.d
        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((Intent) obj, (KProperty<?>) kProperty, ((java.lang.Boolean) obj2).booleanValue());
        }

        @Override // zendesk.messaging.android.internal.IntentDelegate, k80.c
        public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
            return getValue((Intent) obj, (KProperty<?>) kProperty);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/IntentDelegate$Int;", "Lzendesk/messaging/android/internal/IntentDelegate;", "", "key", "", "defaultValue", "<init>", "(Ljava/lang/String;I)V", "getValue", "thisRef", "Landroid/content/Intent;", "property", "Lkotlin/reflect/KProperty;", "(Landroid/content/Intent;Lkotlin/reflect/KProperty;)Ljava/lang/Integer;", "setValue", "", "value", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Int extends IntentDelegate<Integer> {
        private final int defaultValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Int(@NotNull java.lang.String str, int i11) {
            super(str, null);
            str.getClass();
            this.defaultValue = i11;
        }

        @NotNull
        public Integer getValue(@NotNull Intent thisRef, @NotNull KProperty<?> property) {
            thisRef.getClass();
            property.getClass();
            return Integer.valueOf(thisRef.getIntExtra(getKey(), this.defaultValue));
        }

        public void setValue(@NotNull Intent thisRef, @NotNull KProperty<?> property, int value) {
            thisRef.getClass();
            property.getClass();
            thisRef.putExtra(getKey(), value);
        }

        @Override // zendesk.messaging.android.internal.IntentDelegate, k80.d
        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((Intent) obj, (KProperty<?>) kProperty, ((Number) obj2).intValue());
        }

        @Override // zendesk.messaging.android.internal.IntentDelegate, k80.c
        public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
            return getValue((Intent) obj, (KProperty<?>) kProperty);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0002\u0010\rJ,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzendesk/messaging/android/internal/IntentDelegate$Parcelable;", "T", "Landroid/os/Parcelable;", "Lzendesk/messaging/android/internal/IntentDelegate;", "key", "", "<init>", "(Ljava/lang/String;)V", "getValue", "thisRef", "Landroid/content/Intent;", "property", "Lkotlin/reflect/KProperty;", "(Landroid/content/Intent;Lkotlin/reflect/KProperty;)Landroid/os/Parcelable;", "setValue", "", "value", "(Landroid/content/Intent;Lkotlin/reflect/KProperty;Landroid/os/Parcelable;)V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Parcelable<T extends android.os.Parcelable> extends IntentDelegate<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Parcelable(@NotNull java.lang.String str) {
            super(str, null);
            str.getClass();
        }

        @Nullable
        public T getValue(@NotNull Intent thisRef, @NotNull KProperty<?> property) {
            thisRef.getClass();
            property.getClass();
            return (T) thisRef.getParcelableExtra(getKey());
        }

        public void setValue(@NotNull Intent thisRef, @NotNull KProperty<?> property, @Nullable T value) {
            thisRef.getClass();
            property.getClass();
            thisRef.putExtra(getKey(), value);
        }

        @Override // zendesk.messaging.android.internal.IntentDelegate, k80.d
        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((Intent) obj, (KProperty<?>) kProperty, (android.os.Parcelable) obj2);
        }

        @Override // zendesk.messaging.android.internal.IntentDelegate, k80.c
        public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
            return getValue((Intent) obj, (KProperty<?>) kProperty);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0002\u0010\rJ,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzendesk/messaging/android/internal/IntentDelegate$Serializable;", "T", "Ljava/io/Serializable;", "Lzendesk/messaging/android/internal/IntentDelegate;", "key", "", "<init>", "(Ljava/lang/String;)V", "getValue", "thisRef", "Landroid/content/Intent;", "property", "Lkotlin/reflect/KProperty;", "(Landroid/content/Intent;Lkotlin/reflect/KProperty;)Ljava/io/Serializable;", "setValue", "", "value", "(Landroid/content/Intent;Lkotlin/reflect/KProperty;Ljava/io/Serializable;)V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Serializable<T extends java.io.Serializable> extends IntentDelegate<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Serializable(@NotNull java.lang.String str) {
            super(str, null);
            str.getClass();
        }

        @Nullable
        public T getValue(@NotNull Intent thisRef, @NotNull KProperty<?> property) {
            thisRef.getClass();
            property.getClass();
            T t9 = (T) thisRef.getSerializableExtra(getKey());
            if (t9 != null) {
                return t9;
            }
            return null;
        }

        public void setValue(@NotNull Intent thisRef, @NotNull KProperty<?> property, @Nullable T value) {
            thisRef.getClass();
            property.getClass();
            thisRef.putExtra(getKey(), value);
        }

        @Override // zendesk.messaging.android.internal.IntentDelegate, k80.d
        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((Intent) obj, (KProperty<?>) kProperty, (java.io.Serializable) obj2);
        }

        @Override // zendesk.messaging.android.internal.IntentDelegate, k80.c
        public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
            return getValue((Intent) obj, (KProperty<?>) kProperty);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002J%\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¨\u0006\u000e"}, d2 = {"Lzendesk/messaging/android/internal/IntentDelegate$String;", "Lzendesk/messaging/android/internal/IntentDelegate;", "", "key", "<init>", "(Ljava/lang/String;)V", "getValue", "thisRef", "Landroid/content/Intent;", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class String extends IntentDelegate<java.lang.String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public String(@NotNull java.lang.String str) {
            super(str, null);
            str.getClass();
        }

        @NotNull
        public java.lang.String getValue(@NotNull Intent thisRef, @NotNull KProperty<?> property) {
            thisRef.getClass();
            property.getClass();
            java.lang.String stringExtra = thisRef.getStringExtra(getKey());
            return stringExtra == null ? "" : stringExtra;
        }

        public void setValue(@NotNull Intent thisRef, @NotNull KProperty<?> property, @NotNull java.lang.String value) {
            thisRef.getClass();
            property.getClass();
            value.getClass();
            thisRef.putExtra(getKey(), value);
        }

        @Override // zendesk.messaging.android.internal.IntentDelegate, k80.d
        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((Intent) obj, (KProperty<?>) kProperty, (java.lang.String) obj2);
        }

        @Override // zendesk.messaging.android.internal.IntentDelegate, k80.c
        public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
            return getValue((Intent) obj, (KProperty<?>) kProperty);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002J%\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lzendesk/messaging/android/internal/IntentDelegate$MessagingScreenDelegate;", "Lzendesk/messaging/android/internal/IntentDelegate;", "Lzendesk/android/messaging/MessagingScreen;", "key", "", "defaultValue", "<init>", "(Ljava/lang/String;Lzendesk/android/messaging/MessagingScreen;)V", "getValue", "thisRef", "Landroid/content/Intent;", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MessagingScreenDelegate extends IntentDelegate<MessagingScreen> {

        @NotNull
        private final MessagingScreen defaultValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessagingScreenDelegate(@NotNull java.lang.String str, @NotNull MessagingScreen messagingScreen) {
            super(str, null);
            str.getClass();
            messagingScreen.getClass();
            this.defaultValue = messagingScreen;
        }

        @NotNull
        public MessagingScreen getValue(@NotNull Intent thisRef, @NotNull KProperty<?> property) {
            thisRef.getClass();
            property.getClass();
            b bVar = c.f30748d;
            MessagingScreen.Companion companion = MessagingScreen.INSTANCE;
            java.lang.String strC = bVar.c(companion.serializer(), this.defaultValue);
            java.lang.String stringExtra = thisRef.getStringExtra(getKey());
            if (stringExtra != null) {
                strC = stringExtra;
            }
            try {
                return (MessagingScreen) bVar.b(companion.serializer(), strC);
            } catch (Exception unused) {
                return this.defaultValue;
            }
        }

        public void setValue(@NotNull Intent thisRef, @NotNull KProperty<?> property, @NotNull MessagingScreen value) {
            thisRef.getClass();
            property.getClass();
            value.getClass();
            thisRef.putExtra(getKey(), c.f30748d.c(MessagingScreen.INSTANCE.serializer(), value));
        }

        @Override // zendesk.messaging.android.internal.IntentDelegate, k80.d
        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((Intent) obj, (KProperty<?>) kProperty, (MessagingScreen) obj2);
        }

        @Override // zendesk.messaging.android.internal.IntentDelegate, k80.c
        public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
            return getValue((Intent) obj, (KProperty<?>) kProperty);
        }
    }
}
