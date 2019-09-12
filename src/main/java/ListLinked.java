public class ListLinked<T> {
    Model<T, Model>[] list = new Model[4];

    public void add(T element){
        if(list.length == 0){
            list[0].element = element;
        } else {
            for (int i = 0; i < list.length; i++) {
                if(list[i].model == null){
                    list[i+1].element = element;
                    list[i].model = list[i+1];
                    break;
                }
            }
        }
    }

    public T get(int index){
        return list[index].element;
    }

    public int size(){
        return list.length;
    }
}
