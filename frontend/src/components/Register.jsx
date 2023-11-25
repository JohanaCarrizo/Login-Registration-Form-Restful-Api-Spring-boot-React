import React from 'react'
import { useForm } from 'react-hook-form'

export const Register = () => {

  const { register, handleSubmit } = useForm();
  

  const handleSubmitForm = (data) => {
    console.log(data);
  };

  return (
    <>
      <h1>Formulario de Registro</h1>
      <form onSubmit={handleSubmit(handleSubmitForm)}>
      <div className="mb-3">
          <label htmlFor="exampleInputName" className="form-label">Nombre</label>
          <input {...register('name', {required: true})} type="text" className="form-control" id="exampleInputName" aria-describedby="emailHelp"/>
       </div>
        <div className="mb-3">
          <label htmlFor="exampleInputEmail1" className="form-label">Correo</label>
          <input {...register('email', {required: true})} type="email" className="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
       </div>
        <div className="mb-3">
          <label htmlFor="exampleInputPassword1" className="form-label">Contraseña</label>
          <input {...register('password', {required: true})} type="password" className="form-control" id="exampleInputPassword1"/>
      </div>
      <button type="submit" className="btn btn-primary">Registrar</button>
      </form>
    </>
  )
}
