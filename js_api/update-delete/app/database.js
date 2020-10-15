import MongoClient from 'mongodb';

export async function connect(){
    try{
    const client = await MongoClient.connect('mongodb+srv://sem:senpai_SEM21@sembenaventedb-dtsxo.mongodb.net/test?retryWrites=true&w=majority', {useNewUrlParser:true,useUnifiedTopology: true});
    const db = client.db('marketdb');
    console.log('DB is connected');
    return db;
    } catch(e){
        console.log(e);
    }
}


