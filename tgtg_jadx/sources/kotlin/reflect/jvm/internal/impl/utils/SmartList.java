package kotlin.reflect.jvm.internal.impl.utils;

import com.braze.Constants;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import m0.i1;
import org.bouncycastle.jce.provider.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess {
    private Object myElem;
    private int mySize;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class EmptyIterator<T> implements Iterator<T> {
        private static final EmptyIterator INSTANCE = new EmptyIterator();

        private EmptyIterator() {
        }

        public static <T> EmptyIterator<T> getInstance() {
            return INSTANCE;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public class SingletonIterator extends SingletonIteratorBase<E> {
        private final int myInitialModCount;

        public SingletonIterator() {
            super();
            this.myInitialModCount = ((AbstractList) SmartList.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        public void checkCoModification() {
            if (((AbstractList) SmartList.this).modCount == this.myInitialModCount) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) SmartList.this).modCount + "; expected: " + this.myInitialModCount);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        public E getElement() {
            return (E) SmartList.this.myElem;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkCoModification();
            SmartList.this.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static abstract class SingletonIteratorBase<T> implements Iterator<T> {
        private boolean myVisited;

        private SingletonIteratorBase() {
        }

        public abstract void checkCoModification();

        public abstract T getElement();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.myVisited;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.myVisited) {
                i1.c();
                return null;
            }
            this.myVisited = true;
            checkCoModification();
            return getElement();
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
        switch (i11) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = Constants.BRAZE_PUSH_CONTENT_KEY;
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i11 == 2 || i11 == 3) {
            objArr[1] = "iterator";
        } else if (i11 == 5 || i11 == 6 || i11 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i11) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 5 && i11 != 6 && i11 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, E e5) {
        int i12;
        if (i11 < 0 || i11 > (i12 = this.mySize)) {
            a.e(this.mySize, org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Index: ", ", Size: "));
            return;
        }
        if (i12 == 0) {
            this.myElem = e5;
        } else if (i12 == 1 && i11 == 0) {
            this.myElem = new Object[]{e5, this.myElem};
        } else {
            Object[] objArr = new Object[i12 + 1];
            Object obj = this.myElem;
            if (i12 == 1) {
                objArr[0] = obj;
            } else {
                Object[] objArr2 = (Object[]) obj;
                System.arraycopy(objArr2, 0, objArr, 0, i11);
                System.arraycopy(objArr2, i11, objArr, i11 + 1, this.mySize - i11);
            }
            objArr[i11] = e5;
            this.myElem = objArr;
        }
        this.mySize++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.myElem = null;
        this.mySize = 0;
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.mySize)) {
            a.e(this.mySize, org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Index: ", ", Size: "));
            return null;
        }
        E e5 = (E) this.myElem;
        return i12 == 1 ? e5 : (E) ((Object[]) e5)[i11];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        int i11 = this.mySize;
        if (i11 == 0) {
            EmptyIterator emptyIterator = EmptyIterator.getInstance();
            if (emptyIterator == null) {
                $$$reportNull$$$0(2);
            }
            return emptyIterator;
        }
        if (i11 == 1) {
            return new SingletonIterator();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            $$$reportNull$$$0(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.mySize)) {
            a.e(this.mySize, org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Index: ", ", Size: "));
            return null;
        }
        Object obj = (E) this.myElem;
        if (i12 == 1) {
            this.myElem = null;
        } else {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[i11];
            if (i12 == 2) {
                this.myElem = objArr[1 - i11];
            } else {
                int i13 = (i12 - i11) - 1;
                if (i13 > 0) {
                    System.arraycopy(objArr, i11 + 1, objArr, i11, i13);
                }
                objArr[this.mySize - 1] = null;
            }
            obj = (E) obj2;
        }
        this.mySize--;
        ((AbstractList) this).modCount++;
        return (E) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e5) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.mySize)) {
            a.e(this.mySize, org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Index: ", ", Size: "));
            return null;
        }
        E e11 = (E) this.myElem;
        if (i12 == 1) {
            this.myElem = e5;
            return e11;
        }
        Object[] objArr = (Object[]) e11;
        E e12 = (E) objArr[i11];
        objArr[i11] = e5;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.mySize;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i11 = this.mySize;
        if (i11 >= 2) {
            Arrays.sort((Object[]) this.myElem, 0, i11, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        if (tArr == 0) {
            $$$reportNull$$$0(4);
        }
        int length = tArr.length;
        int i11 = this.mySize;
        if (i11 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.myElem;
                return tArr2;
            }
            tArr[0] = this.myElem;
        } else {
            if (length < i11) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.myElem, i11, tArr.getClass());
                if (tArr3 == null) {
                    $$$reportNull$$$0(6);
                }
                return tArr3;
            }
            if (i11 != 0) {
                System.arraycopy(this.myElem, 0, tArr, 0, i11);
            }
        }
        int i12 = this.mySize;
        if (length > i12) {
            tArr[i12] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e5) {
        int i11 = this.mySize;
        if (i11 == 0) {
            this.myElem = e5;
        } else {
            Object obj = this.myElem;
            if (i11 == 1) {
                this.myElem = new Object[]{obj, e5};
            } else {
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                if (i11 >= length) {
                    int i12 = ((length * 3) / 2) + 1;
                    int i13 = i11 + 1;
                    if (i12 < i13) {
                        i12 = i13;
                    }
                    Object[] objArr2 = new Object[i12];
                    this.myElem = objArr2;
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    objArr = objArr2;
                }
                objArr[this.mySize] = e5;
            }
        }
        this.mySize++;
        ((AbstractList) this).modCount++;
        return true;
    }
}
