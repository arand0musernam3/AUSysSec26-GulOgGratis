package kotlin.jvm.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0011\bF\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004*\u00028\u0000H¤\u0080\u0004¢\u0006\u0002\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0086\u0080\u0004¢\u0006\u0002\u0010\u0015J\n\u0010\u0003\u001a\u00020\u0004H\u0084\u0080\u0004J\u001f\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0084\u0080\u0004¢\u0006\u0002\u0010\u0019R\u000f\u0010\u0003\u001a\u00020\u0004X\u0082\u0084\b¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\u0004X\u0084\u008e\b¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eX\u0082\u0084\b¢\u0006\n\n\u0002\u0010\u0011\u0012\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lkotlin/jvm/internal/PrimitiveSpreadBuilder;", "T", "", "size", "", "<init>", "(I)V", "getSize", "(Ljava/lang/Object;)I", "position", "getPosition", "()I", "setPosition", "spreads", "", "getSpreads$annotations", "()V", "[Ljava/lang/Object;", "addSpread", "", "spreadArgument", "(Ljava/lang/Object;)V", "toArray", "values", "result", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class PrimitiveSpreadBuilder<T> {
    private int position;
    private final int size;

    @NotNull
    private final T[] spreads;

    public PrimitiveSpreadBuilder(int i11) {
        this.size = i11;
        this.spreads = (T[]) new Object[i11];
    }

    public final void addSpread(@NotNull T spreadArgument) {
        spreadArgument.getClass();
        T[] tArr = this.spreads;
        int i11 = this.position;
        this.position = i11 + 1;
        tArr[i11] = spreadArgument;
    }

    public final int getPosition() {
        return this.position;
    }

    public abstract int getSize(@NotNull T t9);

    public final void setPosition(int i11) {
        this.position = i11;
    }

    public final int size() {
        int i11 = this.size - 1;
        int size = 0;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                T t9 = this.spreads[i12];
                size += t9 != null ? getSize(t9) : 1;
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return size;
    }

    @NotNull
    public final T toArray(@NotNull T values, @NotNull T result) {
        int i11;
        values.getClass();
        result.getClass();
        int i12 = this.size - 1;
        int i13 = 0;
        if (i12 >= 0) {
            int i14 = 0;
            int i15 = 0;
            i11 = 0;
            while (true) {
                T t9 = this.spreads[i14];
                if (t9 != null) {
                    if (i15 < i14) {
                        int i16 = i14 - i15;
                        System.arraycopy(values, i15, result, i11, i16);
                        i11 += i16;
                    }
                    int size = getSize(t9);
                    System.arraycopy(t9, 0, result, i11, size);
                    i11 += size;
                    i15 = i14 + 1;
                }
                if (i14 == i12) {
                    break;
                }
                i14++;
            }
            i13 = i15;
        } else {
            i11 = 0;
        }
        int i17 = this.size;
        if (i13 < i17) {
            System.arraycopy(values, i13, result, i11, i17 - i13);
        }
        return result;
    }

    private static /* synthetic */ void getSpreads$annotations() {
    }
}
